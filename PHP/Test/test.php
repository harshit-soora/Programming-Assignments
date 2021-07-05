<!DOCTYPE html>
<html>
<head>
	<title>Getting Started</title>
</head>
<body>

	<form method="post">  
		Choose Type:
		<br><br>
		<input type="checkbox" id="circle" name="circle" value="circle">
		<label for="cicle"> Circle </label><br>
		
		<input type="checkbox" id="rect" name="rect" value="rect">
		<label for="rect"> Rectangle </label><br><br>


		Enter Radius:  
		<input type="number" name="R" /><br><br>  

		Enter X:  
		<input type="number" name="X" /><br><br>  
		 
		Enter Y:  
		<input type="number" name="Y" /><br><br> 

		<input type="submit" name="cal" value="Calculate">  
	</form> 	

	 <?php 
		class Circle{
			private $r;
			private $y;

			public function __construct($R){
			  	$this->r = $R;
			}

			public function getArea(){
				$area = pi() * $this->r * $this->r;
				return $area;
			}	

			public function getPerimeter(){
				$peri = 2 * pi() * $this->r;
				return $peri;
			}
		}


		class Rectangle{
			private $x;
			private $y;

			public function __construct($X, $Y){
			  	$this->x = $X;
			  	$this->y = $Y;
			}

			public function getArea(){
				$area = $this->x * $this->y;
				return $area;
			}	

			public function getPerimeter(){
				$peri = 2 * ( $this->x + $this->y );
				return $peri;
			}
		}

		if(isset($_POST['cal']))  
    	{ 
			if($_POST['circle']){
				$rad = $_POST['R'];
				// echo "$rad";
				$c = new Circle($rad);

				echo "<h4>Area of circle  ".$c->getArea()."</h4><br>";

				echo "<h4>Perimeter of circle  ".$c->getPerimeter()."</h4><br>";
			}
			else if($_POST['rect']){
				$x = $_POST['X'];
    			$y = $_POST['Y'];
    			// echo "$x $y";
				$r = new Rectangle($x, $y);

				echo "<h4>Area of Rectangle  ".$r->getArea()."</h4><br>";

				echo "<h4>Perimeter of Rectangle  ".$r->getPerimeter()."</h4><br>";
			}
		}

	 ?>

</body>
</html>



		