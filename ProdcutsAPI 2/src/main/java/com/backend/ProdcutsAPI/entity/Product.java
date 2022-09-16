package com.backend.ProdcutsAPI.entity;

    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;

    @Entity
    public class Product
    {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Integer id;

        private String name;

        private String description;

        private String imageUrl;

        private float price;

        public Integer getId()
        {
            return id;
        }
    }