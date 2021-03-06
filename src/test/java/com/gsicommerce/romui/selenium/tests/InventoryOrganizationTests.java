package com.gsicommerce.romui.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gsicommerce.romui.selenium.pages.ROMUIBasePage;
import com.gsicommerce.romui.selenium.testdata.CatalogInventorySearchData;
import com.gsicommerce.romui.selenium.testdata.InventoryOrganizationData;
import com.gsicommerce.romui.selenium.utilities.RomuiEnumValues;

public class InventoryOrganizationTests extends ROMUIBasePage {
	
	private InventoryOrganizationData inventoryOrganizationData;
	
	@Test(enabled = true, priority = 1, description = "to Verify user able to see Inventory Organization records displayed")
	public void testverfiyInventoryOrgsRecord() throws Exception {

		logger.info("Login credentials to be entered");
		romuipages.loginPage().login(env.getUserName(), env.getPassword());
		// romuipages.homePage().clickOnLandingButton("Order Management");
		logger.info("Navigate to Manage Inventory Organizations page");
		romuipages.orderMgmPage().clickOnInvOrganization();
		logger.info("Verify Inventory Organization Found record display");
		romuipages.inventoryOrganizationPage().verfiyInventoryOrgsRecord();
		logger.info("Inventory Organization Found record displayed");
		
		
	}

	@Test(enabled = true, priority = 3, description = "to Verify user able to view Inventory Organization ")
	public void testViewInventoryOrgsRecord() throws Exception {
		inventoryOrganizationData = InventoryOrganizationData.get(env.getFileLocation());
		logger.info("Login credentials to be entered");
		romuipages.loginPage().login(env.getUserName(), env.getPassword());
		// romuipages.homePage().clickOnLandingButton("Order Management");
		logger.info("Navigate to Manage Inventory Organizations page");
		romuipages.orderMgmPage().clickOnInvOrganization();
		logger.info("Verify User able to click View Inventory Organization ");
		romuipages.inventoryOrganizationPage().clickViewInventoryOrgs();
		logger.info("View Inventory Organization Icon clicked successfully");
		logger.info("Validate Inventory Orgs ID on View Inventory Organization Page ");
		Assert.assertTrue(romuipages.inventoryOrganizationPage().verifyViewInventoryOrgs(0, inventoryOrganizationData.getInventoryOrgID()),"No Data found for Inventory Org ID");
		logger.info("Validate Inventory Organization Name on View Inventory Organization Page ");
		Assert.assertTrue(romuipages.inventoryOrganizationPage().verifyViewInventoryOrgs(1, inventoryOrganizationData.getInventoryOrgName()),"No Data found for Inventory Org Name");
		logger.info("Validate Default Shipping Calendar ID on View Inventory Organization Page ");
		Assert.assertTrue(romuipages.inventoryOrganizationPage().verifyViewInventoryOrgs(3, inventoryOrganizationData.getInventoryOrgShippingCalendarID()),"No Data found for Default Shipping Calendar ID");
		logger.info("Validate Default ATP Rule on View Inventory Organization Page ");
		Assert.assertTrue(romuipages.inventoryOrganizationPage().verifyViewInventoryOrgs(6, inventoryOrganizationData.getDefaultATP()),"No Data found for Default ATP Rule");
		logger.info("Validate Node Rejected Supply Action on View Inventory Organization Page ");
		Assert.assertTrue(romuipages.inventoryOrganizationPage().verifyViewInventoryOrgs(7, inventoryOrganizationData.getNodeRejected()),"No Data found for Node Rejected Supply Action");
	}

	@Test(enabled = true, priority = 2, description = "to Verify user able to Edit Inventory Organization ")
	public void testEditInventoryOrgs() throws Exception {
		logger.info("Login credentials to be entered");
		romuipages.loginPage().login(env.getUserName(), env.getPassword());
		// romuipages.homePage().clickOnLandingButton("Order Management");
		logger.info("Navigate to Manage Inventory Organizations page");
		romuipages.orderMgmPage().clickOnInvOrganization();
		logger.info("Verify User able to click Edit Inventory Organization ");
		romuipages.inventoryOrganizationPage().clickEditInventoryOrgs();	
		logger.info("Edit Inventory Organization Icon clicked successfully");
		logger.info("Verify User able to Edit Inventory Organization data .");
		romuipages.inventoryOrganizationPage().EditInventoryOrgs();
		logger.info("Edit Inventory Organization data Verified");
		
	}	
	
	@Test(enabled = true, priority = 4, description = "to Verify user able to Edit Inventory Organization data from View Page ")
	public void testEditInventoryOrgsFromView() throws Exception {
		logger.info("Login credentials to be entered");
		romuipages.loginPage().login(env.getUserName(), env.getPassword());
		// romuipages.homePage().clickOnLandingButton("Order Management");
		logger.info("Navigate to Manage Inventory Organizations page");
		romuipages.orderMgmPage().clickOnInvOrganization();
		logger.info("Verify User able to click Edit Inventory Organization ");
		romuipages.inventoryOrganizationPage().EditInventoryOrgsFromView();
		logger.info("Edit Inventory Organization Icon clicked successfully");
		logger.info("Edit Data on Edit Inventory Organization page");
		logger.info("Edit Inventory Organization from View Inventory Organization page Verified");
		
	}	
	
}
