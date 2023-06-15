<template>

    <v-card outlined>
        <v-card-title>
            CreateAdvertisement
        </v-card-title>

        <v-card-text>
            <String label="Content" v-model="value.content" :editMode="editMode"/>
            <String label="Channel" v-model="value.channel" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createAdvertisement"
            >
                CreateAdvertisement
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
        name: 'CreateAdvertisementCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.content = '';
            this.value.channel = '';
        },
        watch: {
        },
        methods: {
            createAdvertisement() {
                this.$emit('createAdvertisement', this.value);
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

