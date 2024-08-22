package AnalysisTools.HPVisuals.playwright.Steps;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Example {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setViewportSize(1512, 738));
            Page page = context.newPage();
            page.navigate("https://familyhistory-dev.cancer.gov/html/index.html");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create a Family Health History")).click();
            page.getByLabel("*Name:").click();
            page.getByLabel("*Name:").fill("Kevin Mata");
            page.getByRole(AriaRole.RADIO, new Page.GetByRoleOptions().setName("Male").setExact(true)).check();
            page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("Select date")).click();
            page.getByRole(AriaRole.COMBOBOX).nth(3).selectOption("11");
            page.getByRole(AriaRole.COMBOBOX).nth(4).selectOption("1996");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("3").setExact(true)).click();
            page.getByLabel("Feet").click();
            page.getByLabel("Feet").fill("6");
            page.getByLabel("Inches").click();
            page.getByLabel("Inches").fill("0");
            page.getByLabel("Weight").click();
            page.getByLabel("Weight").fill("195");
            page.getByLabel("Enter Personal Information", new Page.GetByLabelOptions().setExact(true)).locator("#disease_choice_select").selectOption("Cancer");
            page.getByLabel("Enter Personal Information", new Page.GetByLabelOptions().setExact(true)).locator("#detailed_disease_choice_select").selectOption("SNOMED_CT-269466003");
            page.getByLabel("Enter Personal Information", new Page.GetByLabelOptions().setExact(true)).locator("#age_at_diagnosis_select").selectOption("teen");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add")).click();
            page.getByLabel("White").check();
            page.getByLabel("Hispanic or Latino", new Page.GetByLabelOptions().setExact(true)).check();
            page.getByLabel("Central American").check();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
            page.locator("#family_brothers").click();
            page.locator("#family_brothers").fill("2");
            page.locator("#family_sisters").click();
            page.locator("#family_sisters").fill("1");
            page.locator("#family_sons").click();
            page.locator("#family_sons").fill("0");
            page.locator("#family_daughters").click();
            page.locator("#family_daughters").fill("0");
            page.locator("#family_maternal_uncles").click();
            page.locator("#family_maternal_uncles").fill("7");
            page.locator("#family_maternal_aunts").click();
            page.locator("#family_maternal_aunts").fill("2");
            page.locator("#family_paternal_uncles").click();
            page.locator("#family_paternal_uncles").fill("3");
            page.locator("#family_paternal_aunts").click();
            page.locator("#family_paternal_aunts").fill("2");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Check Your Familial Risk")).click();
            assertThat(page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Colorectal Cancer")).getByRole(AriaRole.IMG).first()).isVisible();
            assertThat(page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Heart Disease")).getByRole(AriaRole.IMG).first()).isVisible();
            assertThat(page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Diabetes")).getByRole(AriaRole.IMG).first()).isVisible();
        }
    }
}
