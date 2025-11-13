const { test, expect } = require("@playwright/test");
test("Bidding valid&invalid", async ({ page }) => {
  await page.goto("https://boli.ae/login");
  await page.locator("//input[@id='email']").fill("bolitesting@yopmail.com");
  await page.locator("//input[@id='password']").fill("bolitesting@yopmail.com");
  await page.getByRole("button", { name: "Login", exact: true }).click();
  await page.waitForTimeout(4000);
  //   await expect(
  //     page.getByText("Login Successful", { exact: true })
  //   ).toBeVisible();
  await page.getByRole("button", { name: "Bid Now", index: [1] }).click();
});
