'use strict';

/**
 * Master Controller
 */
angular.module('GE-AWS')
  .controller('MasterCtrl', ['$scope','$location','patientService', function ($scope, $location,patientService) {      
      $scope.isActive = function (viewLocation) {          
        var active = (viewLocation === $location.path());
        return active;
      };
      $scope.addResult = false;
      
      $scope.getMsg = function(){
    	  $scope.msg =  patientService.msg();
      };
      $scope.resetMsg = function(){
    	  $scope.patient =  {patientID : '',
    			  patientName : '',
    			  patientGender :''};
    	  $scope.addResult=false;
      };
     
      $scope.addPatient = function(){
    	patientService.addPatient($scope.patient);
    	$scope.resetMsg();
    	$scope.addResult=true;
      }
    	  
  }]);

