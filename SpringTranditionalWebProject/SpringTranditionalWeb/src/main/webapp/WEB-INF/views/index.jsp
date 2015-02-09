<!DOCTYPE html>
<html>
<head>
    <title>Play2 WebJars Demo</title>
    <link rel='stylesheet' media='screen' href='<%=request.getContextPath()%>/webjars/bootstrap/2.1.1/css/bootstrap.min.css'>
    <script type='text/javascript' src='<%=request.getContextPath()%>/webjars/jquery/1.8.2/jquery.min.js'></script>
    <script type='text/javascript' src='<%=request.getContextPath()%>/webjars/bootstrap/2.1.1/js/bootstrap.min.js'></script>
    <script type='text/javascript' src='<%=request.getContextPath()%>/spring-mvc/static/inner.js'></script>
    <style type="text/css">
        body {
            margin-top: 50px;
        }
    </style>
    <script type="text/javascript">
        $(function() {
            $("#showModalButton").bind('click', function(event) {
                $('#myModal').modal()
            })
        })
    </script>
</head>
<body>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container-fluid">
            <a id="titleLink" class="brand" href="/">hello, bootstrap</a>
        </div>
    </div>
</div>

<div class="container">
    <button id="showModalButton" class="btn btn-primary btn-large"><i class="icon-exclamation-sign icon-white"></i> Show a Modal</button>
</div>

<div id="myModal" class="modal hide fade">
    <div class="modal-header">
        <button class="close" data-dismiss="modal">&times;</button>
        <h3>This is a Modal</h3>
    </div>
    <div class="modal-body">
        <p>Bootstrap depends on jQuery.  So when you specify Bootstrap as a dependency you get jQuery too.</p>
    </div>
    <div class="modal-footer">
        <a href="#" class="btn" data-dismiss="modal">Close</a>
    </div>
</div>
</body>
</html>