<%-- 
    Document   : Login
    Created on : May 17, 2018, 8:41:10 AM
    Author     : generation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"  crossorigin="anonymous">
    </head>
    
    
    <body class="container">
       
        
         <form action = "Controlador" method="GET">
            
            <h1>Get</h1>
            
            <div class="row"> 
                
                <div class="col-sm-6">
                     <input class ="form-control" type="text" name="usuario" placeholder="Nombre"/>
                </div>
                
                <div class="col-sm-6">
                     <input class ="form-control" type="password" name="contraseña" placeholder="Contraseña"/>
                </div>
                
                <div class="col-sm-6" id="submit">
                     <input class="btn btn-success" type="submit" />
                </div>
                
           </div>
              <div class="col-sm-6">
                     <input class="btn btn-success" type="submit" />
                </div>
            <input type="checkbox" name="pelicula" value="starwars"/>Estarguars
            <input type="checkbox" name="pelicula" value="avengers" />Abenyers
            <input type="checkbox" name="pelicula" value="ironMan"/>Airon man
            
          
            
        </form>
        <!--   -->
        
        <form action = "Controlador" method="POST" class="form-horizontal">
            
            <h1>Post</h1>
            
            <div class="row">             
               
                
                    <div class="col-sm-6">
                        <input class ="form-control" type="text" name="usuario" placeholder="Nombre"/>
                    </div>
                
                    <div class="col-sm-6">                   
                        <input class ="form-control" type="password" name="contraseña" placeholder="Contraseña"/>
                    </div>
                
                      <div class="col-sm-6">
                         <input class="btn btn-success" type = "submit" />
                     </div>
            </div>
            
        </form>
        
        
         <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"  crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"  crossorigin="anonymous"></script>

        
        
    </body>
</html>
