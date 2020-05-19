# Play-a-Story---Design-Patterns-coded-in-Java
# Create a character and make the character play various games using multiple Design Patterns; coded in Java
# Once a character is created, user is allowed to choose a story from Thief, Mage or Warrior.
# Based on the story chosen, the game goes on.

Following Design Patterns are used:

1. Builder Pattern - To create characters

2. Factory Pattern - Builder + Factory used to create characters

3. Singleton Pattern - Only one object instance coordinates actions across the entire system

4. Interface + Abstract Class Pattern - We have an interface named CharcaterIF and an Abstract class named AbstractCharacters 
which implements the CharacterIF and the Abstract class AbstractCharacters is further extended by the 3 Character classes namely, 
Human_CharacterA, Human_CharacterB and Monster_Character.

5. Strategy Pattern - We basically have 3 stories to choose from for a character: thief, mage and warrior. 
In every story we reach a point where a strategy has to be chosen from a set of strategies to make a decision

6. Marker Interface Pattern - Marker Interface Pattern is used to mark a gender for a character. 
We have an empty marker interface named Female
