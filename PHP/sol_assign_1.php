<!DOCTYPE html>
<html>
<head>
	<title>Getting Started</title>
</head>
<body>

	<?php 
		$covid = "COVID-19";

		$covid_1 = "Coronavirus disease 2019 (COVID-19), also known as the coronavirus, or COVID, is a contagious disease caused by severe acute respiratory syndrome coronavirus 2 (SARS-CoV-2). The first known case was identified in Wuhan, China, in December 2019. The disease has since spread worldwide, leading to an ongoing pandemic.\n\n";

		$covid_2 = "Symptoms of COVID-19 are variable, but often include fever, cough, headache, fatigue, breathing difficulties, and loss of smell and taste. Symptoms may begin one to fourteen days after exposure to the virus. At least a third of people who are infected do not develop noticeable symptoms. Of those people who develop noticeable symptoms enough to be classed as patients, most (81%) develop mild to moderate symptoms (up to mild pneumonia), while 14% develop severe symptoms (dyspnea, hypoxia, or more than 50% lung involvement on imaging), and 5% suffer critical symptoms (respiratory failure, shock, or multiorgan dysfunction). Older people are at a higher risk of developing severe symptoms. Some people continue to experience a range of effects (long COVID) for months after recovery, and damage to organs has been observed. Multi-year studies are underway to further investigate the long-term effects of the disease.\n\n"; 

		echo "<h4>".$covid."</h4>";
		echo "<p>".$covid_1."</p>";
		echo "<p>".$covid_2."</p>";

	 ?>

	 <?php 
	 	$division = "DIVISION";
	 	$x = 5;
		$y = -3;

		$ans = $x / $y;

		echo "<h4>".$division."</h4>";
		echo "<p>"."X = ".$x."</p>";
		echo "<p>"."Y = ".$y."</p>";
		echo "<p>"."X div Y = ".$ans."</p>";
	 ?>

</body>
</html>



		