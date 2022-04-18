// Esto siempre se deberá poner
///<reference types="Cypress" />

// describe sería el test suite
describe("Automatizaciones, TS01", function() {
    // Before: carga fichero json con info
    before(function() {
        cy.fixture("dataUsers.json").then((fix)=>{
            this.fx = fix
        })
    })
    
    // skip salta la primera prueba
    it.skip("should_enter_with_login", function(){
        cy.log("Ejecutando prueba 01")
        
        // Visitar la página
        cy.visit("https://www.saucedemo.com/")

        // Recuperar elementos
        cy.get("#user-name").type("standard_user")
        // Esperar
        cy.wait(1000)
        // Otra forma
        cy.get('[data-test="password"]').type("secret_sauce")
        cy.wait(1000)
        // Hacer click
        cy.get('[data-test="login-button"]').click()
    }),
    it("should_enter_with_login_from_file", function(){
        cy.log("Ejecutando prueba 02")
        
        // Visitar la página
        cy.visit("https://www.saucedemo.com/")

        // Recuperar elementos
        cy.get("#user-name").type(this.fx.user_name)
        // Esperar
        cy.wait(1000)
        // Otra forma
        cy.get('[data-test="password"]').type(this.fx.password)
        cy.wait(1000)
        // Hacer click
        cy.get('[data-test="login-button"]').click()
        
        // Assertion
        cy.wait(1000)
        cy.get("#item_4_title_link > .inventory_item_name").should('have.text', "Sauce Labs Backpack")
    })
})