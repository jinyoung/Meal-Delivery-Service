<template>

    <v-card outlined>
        <v-card-title>
            AddToOrder
        </v-card-title>

        <v-card-text>
            <Number label="OrderId" v-model="value.orderId" :editMode="editMode"/>
            <Number label="RecipeId" v-model="value.recipeId" :editMode="editMode"/>
            <Number label="Quantity" v-model="value.quantity" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="addToOrder"
            >
                AddToOrder
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'AddToOrderCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.orderId = 0;
            this.value.recipeId = 0;
            this.value.quantity = 0;
        },
        watch: {
        },
        methods: {
            addToOrder() {
                this.$emit('addToOrder', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

