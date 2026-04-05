# Lab 03/04: Abstraction & Polymorphism - The Smart Home System 🏠⚡

## 🎯 Objective
In this lab, you will build a "Master Controller" for a Smart Home. You will learn how to define a **Contract** (Abstraction) and then execute that contract across different types of devices (Polymorphism).

---

## 🛠️ Step-by-Step Instructions

### Step 1: The Base "Contract"
Open `src/SmartDevice.java`. This class represents the *idea* of a device.
1. Mark the class as `abstract`.
2. Ensure the `name` field is `private`.
3. Create an **abstract method** called `activate()`. 
   * *Note: Abstract methods do not have a body `{ }`, they end with a semicolon `;`.*

### Step 2: Implementing the Hardware
Create two new classes in the `src/` folder: `SmartLight.java` and `SmartThermostat.java`.
1. Both classes must `extend SmartDevice`.
2. Use the `super(name)` keyword in their constructors to pass the name up to the parent.
3. **Override** the `activate()` method:
   - **Light**: Print "[Name] is now ON at 100% brightness."
   - **Thermostat**: Print "[Name] is setting temperature to 72 degrees."

### Step 3: The Master Controller (Polymorphism)
Open `src/Main.java`. This is where the magic happens.
1. Create an `ArrayList` that can hold `SmartDevice` objects.
2. Add at least one `SmartLight` and one `SmartThermostat` to this list.
3. Use a **single `for` loop** to iterate through the list and call `.activate()` on every device.

---

## 🚦 Constraints & Rules
- **No Direct Instantiation**: You must NOT be able to write `new SmartDevice("Timer")`. If you try, the code should fail to compile.
- **Encapsulation**: All fields must be `private`. Use `getName()` to access the name in subclasses.
- **Annotations**: Use the `@Override` annotation above your `activate` methods to ensure type safety.

---

## ✅ Pre-Submission Checklist
Before you `git push` your final version, verify the following:

- [ ] **Compiles?** Run `javac src/*.java` in your terminal. There should be no errors.
- [ ] **Abstraction?** Is the `SmartDevice` class marked `abstract`?
- [ ] **Inheritance?** Do your subclasses use `extends`?
- [ ] **Polymorphism?** Does your `Main.java` use a List of the **Parent** type (`SmartDevice`) to hold the **Child** objects?
- [ ] **No "Instanceof"?** Did you avoid using `if (device instanceof SmartLight)`? (Polymorphism should handle this automatically!)
- [ ] **Commit History?** Do you have at least 3 distinct commits with descriptive messages? (e.g., "Implement SmartLight", "Add polymorphic loop in Main").

---

## 📤 How to Submit
1. Save all your files.
2. In your terminal, run:
   ```bash
   git add .
   git commit -m "Final Submission: Completed Lab 03/04"
   git push origin main
