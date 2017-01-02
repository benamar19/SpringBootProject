var app=angular.module("MyApp",[]);
app.controller("MyController",function($scope,$http)  {
	$scope.prods=null;
	$scope.motCle="";
	$scope.pages=[];
	$scope.curentPage=0;
	$scope.chargerProduits=function(){
	
		$http.get("http://localhost:8989/cherche?mc="+$scope.motCle+"&page="
				+$scope.curentPage)
		.then(function (success)
				{
			    // put the result of the http get into prods 
			    $scope.prods=success.data;
				//to add pages number in a table pages
			      $scope.pages=new Array (success.data.totalPages);
				},
			  function (error){console.log="erreur ya"}
			 );
		
	}
	$scope.goToPage=function (p){
		$scope.curentPage=p;
		$scope.chargerProduits();
		
	}
	
});