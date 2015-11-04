var angularApp = angular.module('sampleApp',['ngAnimate','ngRoute', 'ngResource','spring-data-rest','ui.bootstrap','ngSanitize','pascalprecht.translate']);
angularApp.run(['$rootScope', '$translate',function($rootScope, $translate) {
	$rootScope.page = {};
	$rootScope.alerts = [];
	$rootScope.locales= [];
	$rootScope.locale= "";
}]);

angularApp.config(['$routeProvider', '$translateProvider','$httpProvider',function($routeProvider, 	$translateProvider,$httpProvider) {
	
	 $translateProvider.translations('en', {
		 	'entity.Player.name': 'Player Name',
		 	'entity.Player.team': 'Team of player',
		    'entity.Team.name': 'Team Name',
		    'entity.Team.players': 'Players of team'
		  });
	 $translateProvider.preferredLanguage('en');
	generateRoute($routeProvider);
	$routeProvider.when('/',{templateUrl: 'templates/main.html', controller : 'MainCtrl'})
	.otherwise({redirectTo: '/'});
	
}]);

angularApp.controller('MainCtrl',['$scope','$rootScope', MainCtrl]);

function MainCtrl($scope,$rootScope) {
	
}