<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
<h2>Media Objects</h2>
<p>Use the "media-left" class to left-align a media object. Text that should appear next to the image, is placed inside a container with class="media-body".</p>
  <p>Tip: Use the "media-right" class to right-align the media object.</p><br>
    <!-- Left-aligned media object -->
    <div class="media">
    	<div class="media-left">
    		<img src="img_avatar1.png" class="media-object" style="width:60px">
    	</div>
		    	<div class="media-body">
		      <h4 class="media-heading">Left-aligned</h4>
		      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
		    </div>
    </div>
      <!-- Right-aligned media object -->
  <div class="media">
    <div class="media-body">
      <h4 class="media-heading">Right-aligned</h4>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
    </div>
    <div class="media-right">
      <img src="img_avatar1.png" class="media-object" style="width:60px">
    </div>
  </div>
</div>
    

 </body>
 </html>
