package org.example.tests;

import org.example.pages.HomePage;
import org.example.pages.ListPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResponsiveElementTests extends BaseTest {

    @Test
    @DisplayName("Should display responsive element at 767px width at home page")
    void shouldDisplayResponsiveElementAt767pxWidthAtHomePage() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        driver.manage().window().setSize(new org.openqa.selenium.Dimension(767, 800));

        Thread.sleep(5000);

        assertThat(homePage.getResponsiveElement().isDisplayed()).isTrue();
    }

    @Test
    @DisplayName("Should display responsive element at 767px width at home page at list page")
    void shouldDisplayResponsiveElementAt767pxWidthAtHomePageAtListPage() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        homePage.getListLink().click();

        driver.manage().window().setSize(new Dimension(767, 800));

        Thread.sleep(5000);

        assertThat(homePage.getResponsiveElement().isDisplayed()).isTrue();
    }
}
