<html>
<body>
	<form action="file/upload" enctype="multipart/form-data" method="POST"
		onsubmit="check();">
		<div>
			<label for="versionName">versionName </label><input type="text"
				id="versionName" name="name" required />
		</div>
		<br />
		<div>
			<label>downloadUrl </label><input type="file" name="file" />
		</div>
		<br /> <input type="submit" value="upload" />
	</form>
</body>
<script>
	function check() {
		var val = document.getElementsByName('file')[0].value;
		var type = val.substring(val.lastIndexOf('.') + 1);
		console.log(type);
		if (type !== 'apk') {
			alert('请上传apk文件');
			return false;
		}
	}
</script>
</html>
