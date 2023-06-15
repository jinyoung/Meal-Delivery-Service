
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import IngredientManager from "./components/listers/IngredientCards"
import IngredientDetail from "./components/listers/IngredientDetail"

import RecipeManager from "./components/listers/RecipeCards"
import RecipeDetail from "./components/listers/RecipeDetail"

import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"

import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"

import AdvertisementManager from "./components/listers/AdvertisementCards"
import AdvertisementDetail from "./components/listers/AdvertisementDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/ingredients',
                name: 'IngredientManager',
                component: IngredientManager
            },
            {
                path: '/ingredients/:id',
                name: 'IngredientDetail',
                component: IngredientDetail
            },

            {
                path: '/recipes',
                name: 'RecipeManager',
                component: RecipeManager
            },
            {
                path: '/recipes/:id',
                name: 'RecipeDetail',
                component: RecipeDetail
            },

            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },

            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },

            {
                path: '/advertisements',
                name: 'AdvertisementManager',
                component: AdvertisementManager
            },
            {
                path: '/advertisements/:id',
                name: 'AdvertisementDetail',
                component: AdvertisementDetail
            },



    ]
})
