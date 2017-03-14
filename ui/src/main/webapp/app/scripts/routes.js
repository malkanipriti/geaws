'use strict';

/**
 * Route configuration.
 */
angular.module('GE-AWS').config(['$stateProvider', '$urlRouterProvider', '$httpProvider',
    function($stateProvider, $urlRouterProvider, $httpProvider) {

        // For unmatched routes
        $urlRouterProvider.otherwise('/');

        // Application routes
        $stateProvider
            .state('case', {
            	controller : 'MasterCtrl',
                url: '/',
                templateUrl: 'app/views/create.html'
            })
            .state('test', {
            	controller : 'MasterCtrl',
                url: '/test',
                templateUrl: 'app/views/test.html'
            });

            //$httpProvider.interceptors.push('APIInterceptor');
    }

    
    
]);