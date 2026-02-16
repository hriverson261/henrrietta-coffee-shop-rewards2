# coffee-shop-rewards2

## Coreye’s Coffee Cafe — Rewards System 

### What you’re building

A tiny rewards system where customers earn points, unlock tiers, and can redeem a reward.

### Rules you must support (don’t overthink it)

* Customers earn points from purchases
* They have a tier (Bronze/Silver/Gold)
* They can redeem a “Free Drink” for 100 points (if eligible)

### Starter files (create these)

* `Customer.java`
* `Main.java`
* (Unlocked later) `Purchase.java`
* (Unlocked later) `RewardsProgram.java`

---

# Tier 1 — Beginner Mission: Customer + Points

### Mission

Create a customer model and make points increase from spending.

### You must demonstrate

* fields
* default + parameterized constructors
* getters/setters
* `for` loop
* `if/else`

### Acceptance checks (your program must do this)

* You can create **3 customers**
* You can run a loop that simulates **multiple purchases per customer**
* You collect **dollars spent** from the user
* You add points using this rule:

  * 1 point per $1 (whole dollars only)
  * if spent is at least 10, give a small bonus
* At the end, print each customer’s name + points

### Constraints

* Don’t add extra classes yet.
* Keep it simple: one file for Customer, one file for Main.

---

# Tier 2 — Intermediate Mission: Purchase Objects + Menu Loop

### Mission

Add a second class to represent purchases and simulate ordering from a “menu.”

### You must demonstrate

* a second class with fields + constructor
* multiple objects stored in a list/array (or repeated variables if you’re not ready)
* loops that iterate over “menu items”
* conditional logic tied to purchase properties

### Acceptance checks

* You have a `Purchase` class (you choose the exact fields, but it must support “type” and “price” somehow)
* In `Main`, you build a menu of **at least 6 purchases**
* Each customer “orders” **3 items**
* Points calculation now includes:

  * base points based on price
  * at least **two different bonus rules** triggered by purchase info

> You’re not being told exactly how to store the menu or simulate orders — pick an approach and make it work.

---

# Tier 3 — Difficult Mission: Tiers + Redemption

### Mission

Customers now have a tier label, and they can redeem a reward if eligible.

### You must demonstrate

* a method that derives tier from points
* redemption logic with validation
* summarizing results cleanly

### Acceptance checks

* Your customer can report their tier:

  * < 50 → Bronze
  * < 150 → Silver
  * otherwise → Gold
* After purchases, ask if the customer wants to redeem (Y/N)
* If they try to redeem:

  * if points < 100 → deny
  * else subtract 100 and confirm redemption
* Print a final summary line per customer:

  * Name | Tier | Points

---

# Tier 4 — Advanced Mission: Move Logic Out of Main

### Mission

Main should stop “doing the math.” Business logic belongs in `RewardsProgram`.

### You must demonstrate

* writing a “service” style class
* calling methods from Main instead of duplicating logic
* tier multipliers

### Acceptance checks

* You have a `RewardsProgram` class that:

  * calculates points for a purchase
  * applies points to a customer
  * applies tier multipliers:

    * Bronze x1
    * Silver x1.25
    * Gold x1.5
* Main mostly:

  * creates objects
  * loops through scenarios
  * prints results
  * calls `RewardsProgram` methods
* Promo rule:

  * if total spent in a customer’s session is at least 30 → bonus +25 points

---

## Deliverables (what to turn in)

* All 4 `.java` files
* Clean output that proves each tier works
* Short comment at the top of `Main` explaining:

  * how you simulated purchases
  * where your point rules live

---

## Optional “creative” add-on (still hands-off)

Pick **one**:

* Add a simple text UI menu (1: Buy, 2: Redeem, 3: Summary, 0: Exit)
* Add “receipt printing” (list items + subtotal + points earned)
* Add a “VIP Day” boolean toggle that changes bonus behavior

