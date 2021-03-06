/**
 * Created by karol on 18.12.14.
 */
(function (angular) {
    'use strict';
    angular.module('RootHome', ['ngRoute'])

        .controller('MenuController', function ($scope, $route, $routeParams, $location) {
            $scope.$route = $route;
            $scope.$location = $location;
            $scope.$routeParams = $routeParams;
        })

        .controller('AuctionController', function ($scope, $http) {
            $http({
                url: 'rest/auction',
                method: 'GET'
            }).success(function (data) {
                    $scope.auctions = data;
                }
            ).error(function (data, status, headers, config) {
                    console.log("TODO:")
                    console.log(data);
                    console.log(headers);
                    console.log(status);
                    console.log(config);
                })
        })

        .controller('NewAuctionController', function ($scope, $http) {
            $scope.save = function () {
                console.log($scope.auction);
                $http.post('/rest/auction', $scope.auction)
                    .success(function (data, status, headers, config) {
                        console.log("TODO:")
                        console.log(data);
                        console.log(headers);
                        console.log(status);
                        console.log(config);
                    })
                    .error(function (data, status, headers, config) {
                        console.log("TODO:")
                        console.log(data);
                        console.log(headers);
                        console.log(status);
                        console.log(config);
                    });
            }

        })

        .config(function ($routeProvider, $locationProvider) {
            $routeProvider
                .when('/auction', {
                    templateUrl: 'auction.html',
                    controller: 'AuctionController'
                })
                .when('/newauction', {
                    templateUrl: 'newauction.html',
                    controller: 'NewAuctionController'
                })
                .when('/about', {
                    templateUrl: 'about.html'
                });

            // configure html5 to get links working on jsfiddle
            $locationProvider.html5M
        });
})(window.angular)