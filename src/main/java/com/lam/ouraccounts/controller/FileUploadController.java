package com.lam.ouraccounts.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class FileUploadController {

	private static final Logger logger = Logger.getLogger(FileUploadController.class);

	@RequestMapping("/upload")
	@ResponseBody
	public String uploadFileHandler(@RequestParam("name") String name, @RequestParam("file") MultipartFile file) {
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				// Create the directory to store the file
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "uploadFiles");
				if (!dir.exists())
					dir.mkdirs();
				// Create the file on serve
				File serverFile = new File(dir.getAbsolutePath() + File.separator + file.getOriginalFilename());
				System.out.println(serverFile.getAbsolutePath());
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				logger.info("File upload location: " + serverFile.getAbsolutePath());

				return "You successfully upload file - " + file.getOriginalFilename();
			} catch (IOException e) {
				e.printStackTrace();
				return "You failed upload file - " + file.getOriginalFilename() + "---->" + e.getMessage();
			}
		} else {
			return "You failed upload file - " + file.getOriginalFilename() + ", because the file was empty";
		}
	}

}
