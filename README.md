# DiscordBot

## BotMessages
This class detects if a specified word has been used in a message from users in the server.
If the specified word has been used the bot responds with the below message in discord.

```
The word <specified word> was used in a message
```

For this example the bot stores the message sent in a String variable and checks if it contains the word 'test'.

## BotCommands
This class detects if a command has been used by a user and replies depending on the command used.

### /lucky-number
if this command is used the user is asked to input a number. This number is stored in an int variable that the bot outputs in the below message.

```
your lucky number is: <inputted number>
```

### /add-number
if this command is used the user is asked to input two numbers. These numbers are added together and the result stored in an int variable that the
bot outputs in the below message.

```
the answer is: <result number>
```
