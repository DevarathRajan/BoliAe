import { signupData } from "./data/signUpDataBuyer";
const { test, expect } = require("@playwright/test");
test("Sign Up", async ({ page }) => {
  test.slow();
  await page.goto("https://boli.ae/register");
  await page.locator('//a[@href="/register"]').click;

  //Role button
  await page
    .locator("//select[@aria-hidden='true']")
    .selectOption({ value: "buyer" });

  await page
    .getByRole("textbox", { name: "First Name" })
    .fill(signupData.firstName);
  await page.locator("(//input[@id='lastName'])[1]").fill(signupData.lastName);
  //   const prefixLocator = page.locator(
  //     '//button[@aria-controls = "radix-_r_1o_"]'
  //   );
  //   await prefixLocator.waitFor({ state: "visible", timeout: 5000 });

  //   const prefix = await prefixLocator.textContent();
  //   expect(prefix.trim()).toBe("+971"); //trim to remove all whitespaces.
  await page.locator("//input[@id='phone']").fill(signupData.phone);
  await page.locator("//input[@id='email']").fill(signupData.email);
  await page.locator("//input[@id='password']").fill(signupData.password);
  await page
    .locator("//input[@id='confirmPassword']")
    .fill(signupData.password);

  await page.getByRole("button", { name: "Sign Up", exact: true }).click();
  await expect(
    page.getByText("Registration Successful !", { exact: true })
  ).toBeVisible();
});
