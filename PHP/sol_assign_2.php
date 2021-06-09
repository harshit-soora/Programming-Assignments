<!DOCTYPE html>
<html>
<head>
	<title>Getting Started</title>
</head>
<body>

	<!-- Include will not work at all see this link -->
	<!-- https://stackoverflow.com/questions/3463598/using-php-function-include-to-include-a-png-image -->
	<header>
		<img src="data:image/jpg;base64,<?php echo base64_encode(file_get_contents(dirname(__FILE__).'/logo.jpg')); ?>">
	</header>


	<div>
		<?php

			class Ticket {

				//Properties
				public $Name;
				public $Date;
				public $TicketNumber;
				public $source;
				public $destination;
				public $Type;

				private $Price;


				//Methods
				public function __construct
				  ($name, $date, $tkt, $src, $dest, $type){
					$this->Name = $name;
					$this->Date = $date;
					$this->TicketNumber = $tkt;
					$this->source = $src;
					$this->destination = $dest;
					$this->Type = $type;

					$this->Price = 100;
				}

				//Getter and Setter
				public function setPrice($val) {
					$this->Price = $val;
				}

				public function getPrice() {
					return $this->Price;
				}

			}


			class TrainTicket extends Ticket {

				public function __construct
				  ($name, $date, $tkt, $src, $dest){
				  	parent::__construct(
				  	$name, $date, $tkt, $src, $dest, "Train"
				  	);
				 }

			}


			class FlightTicket extends Ticket {

				public function __construct
				  ($name, $date, $tkt, $src, $dest){
				  	parent::__construct(
				  	$name, $date, $tkt, $src, $dest, "Flight"
				  	);
				 }

			}

			$arrayTkt = array();
			$arrayTkt[0] = new TrainTicket(
				"Ram", "01-01-2012", "1", "Delhi", "Kolkata");

			$arrayTkt[1] = new FlightTicket(
				"Lakshman", "01-01-2012", "2", "CCU", "NDLS");

			$arrayTkt[0]->setPrice(500);
			$arrayTkt[1]->setPrice(5000);


			echo "<h1 align=\"center\">Ticket Table</h1><br>";	

			echo "
			<table align=\"center\">
				<thead>
				   <th scope=\"col\">Name</th>
				   <th scope=\"col\", colspan=\"2\">Date</th>
				   <th scope=\"col\">Ticket Number</th>
				   <th scope=\"col\">Source</th>
				   <th scope=\"col\">Destination</th>
				   <th scope=\"col\">Price</th>
				</thead>

				<tbody>
			";  

			for ($row = 0; $row < 2; $row++) {
				$color = "grey";
				if($arrayTkt[$row]->Type == "Train") {
					$color = "lightblue";
				}
				else{
					$color = "lightbeige";
				}
				
				echo"
				    <tr align=\"center\", bgcolor=".$color.">
				        <td scope=\"row\">".$arrayTkt[$row]->Name."</td>
				        <td colspan=\"2\">".$arrayTkt[$row]->Date."</td>
				        <td>".$arrayTkt[$row]->TicketNumber."</td>
				        <td>".$arrayTkt[$row]->source."</td>
				        <td>".$arrayTkt[$row]->destination."</td>
				        <td>".$arrayTkt[$row]->getPrice()."</td>
				   </tr>
				";
			}

			echo"
				</tbody>
		     </table>
		    ";		
	
		?>
	</div>

	
	<footer>
		<img src="data:image/jpg;base64,<?php echo base64_encode(file_get_contents(dirname(__FILE__).'/logo.jpg')); ?>">
	</footer>

</body>
</html>



		