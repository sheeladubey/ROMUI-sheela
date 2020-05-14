package com.gsicommerce.romui.selenium.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.gsicommerce.romui.selenium.pages.ROMUIBasePage;
import com.gsicommerce.romui.selenium.utilities.RomuiEnumValues;

public class PaymentMethodConfigTests extends ROMUIBasePage {

	@Test(enabled = true, priority = 2, description = "to Verify Edit PaymentMethod Configuration")
	public void testEditPaymentConfig() throws JsonParseException, JsonMappingException, IOException {
		logger.info("Login credentials to be entered");
		romuipages.loginPage().login(env.getUserName(), env.getPassword());
		romuipages.homePage().clickOnLandingButton("Order Management");
		logger.info("Order Management link is clicked on");		
		romuipages.orderMgmPage().clickOnPaymtMethdConfig();
		logger.info("Navigated to PaymentMethod Config page");
		romuipages.paymtMethdConfigPage().editPaymentMethodConfig();
		logger.info("Edit link is clcked on to enter the modified data and Clicked on Save btn");
		logger.info("Verify if edit paymentmethodconfig success message is displayed");
		Assert.assertEquals(romuipages.paymtMethdConfigPage().txtEditSuccessMsg.getText(), RomuiEnumValues.PAYMENT_METHOD_CONFIG_UPDATE.getMessage(), "Payment Config Edit is not updated successfully");
	}
	
	@Test(enabled = true, priority = 1, description = "to Verify Add PaymentMethod Configuration")
	public void testAddPaymentConfig() throws JsonParseException, JsonMappingException, IOException {
		logger.info("Login credentials to be entered");
		romuipages.loginPage().login(env.getUserName(), env.getPassword());
		romuipages.homePage().clickOnLandingButton("Order Management");
		logger.info("Order Management link is clicked on");		
		romuipages.orderMgmPage().clickOnPaymtMethdConfig();
		logger.info("Navigated to PaymentMethod Config page");
		romuipages.paymtMethdConfigPage().addPaymentMethodConfig();
		logger.info("Add link is clcked on to enter the data and Clicked on Save btn");
		logger.info("Verify if add paymentmethodconfig success message is displayed");
		Assert.assertEquals(romuipages.paymtMethdConfigPage().txtEditSuccessMsg.getText(), RomuiEnumValues.PAYMENT_METHOD_CONFIG_ADD.getMessage(), "Payment Config Add is not updated successfully");
	}
	
	@Test(enabled = true, priority = 3, description = "to Verify Delete PaymentMethod Configuration")
	public void testDeletePaymentConfig() throws JsonParseException, JsonMappingException, IOException, InterruptedException {
		logger.info("Login credentials to be entered");
		romuipages.loginPage().login(env.getUserName(), env.getPassword());
		romuipages.homePage().clickOnLandingButton("Order Management");
		logger.info("Order Management link is clicked on");		
		romuipages.orderMgmPage().clickOnPaymtMethdConfig();
		logger.info("Navigated to PaymentMethod Config page");
		romuipages.paymtMethdConfigPage().deletePaymentMethodConfig();
		logger.info("Delete link is clcked on to delete the config");
		logger.info("Verify if delete paymentmethodconfig success message is displayed");
		Assert.assertEquals(romuipages.paymtMethdConfigPage().txtEditSuccessMsg.getText(), RomuiEnumValues.PAYMENT_METHOD_CONFIG_DELETE.getMessage(), "Payment Config Delete is not updated successfully");
	}
}