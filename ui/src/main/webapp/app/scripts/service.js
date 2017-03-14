angular.module('GE-AWS')
.service('patientService',['$http', function ($http) {
	this.msg= function(){
        return "Welcome to angularJS service";
    };  
    
    this.addPatient = function(patient){
    	var result = $http.post('/create',{
    		'patientId': patient.patientID,
    		'patientName': patient.patientName,
    		'patientGender' : patient.patientGender
    	}).then(function(response){
    		
    		
    		return response.data;
    	});
    };

}]);