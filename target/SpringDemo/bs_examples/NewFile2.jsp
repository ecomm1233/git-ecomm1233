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

<div class="container-fluid">
  <h1>Hello World!</h1>
  <p>Resize the browser window to see the effect.</p>
   <div class="row">
    <div class="col-sm-4" style="background-color:lavender;">.col-sm-4</div>
    <div class="col-sm-4" style="background-color:lavenderblush;">.col-sm-4</div>
    <div class="col-sm-4" style="background-color:lavender;">.col-sm-4</div>
  </div> 
    <div class="row">
    <div class="col-sm-4" style="background-color:lavender;">.col-sm-4</div>
    <div class="col-sm-8" style="background-color:lavenderblush;">.col-sm-8</div>
  </div>
</div>
<div class="container">
<h1>Lighter, Secondary Text</h1>
  <p>The small element is used to create a lighter,<mark>highlight</mark> secondary text in any heading:</p>
  <p>The <abbr title="World Health Organization">WHO</abbr> was founded in 1948.</p>
  <h1>h1 Bootstrap heading (36px) <small>secondary text</small></h1>
  <h2>h2 Bootstrap heading (30px) <small>secondary text</small></h2>
  <h3>h3 Bootstrap heading (24px) <small>secondary text</small></h3>
  <h4>h4 Bootstrap heading (18px)<small>secondary text</small></h4>
  <h5>h5 Bootstrap heading (14px)<small>secondary text</small></h5>
  <h6>h6 Bootstrap heading (12px)<small>secondary text</small></h6>
</div>
<div class="container">
  <h1>Blockquotes</h1>
  <p>The blockquote element is used to present content from another source:</p>
  <blockquote>
    <p>For 50 years, WWF has been protecting the future of nature. The world's leading conservation organization, WWF works in 100 countries and is supported by 1.2 million members in the United States and close to 5 million globally.</p>
    <footer>From WWF's website</footer>
  </blockquote>
</div>

<div class="container">
  <h1>Description Lists</h1>    
  <p>The dl element indicates a description list:</p>
  <dl>
    <dt>Coffee</dt>
    <dd>- black hot drink</dd>
    <dt>Milk</dt>
    <dd>- white cold drink</dd>
  </dl>     
</div>
<div class="container">
  <h1>Code Snippets</h1>
  <p>Inline snippets of code should be embedded in the code element:</p>
  <p>The following HTML elements: <code>span</code>, <code>section</code>, and <code>div</code> defines a section in a document.
  this one  <kbd>ctrl + p</kbd> to use print dialog box</p>
  <pre>
	Text in a pre element
	is displayed in a fixed-width
	font, and it preserves
	both      spaces and
	line breaks.
	</pre>
</div>

</body>
</html>
