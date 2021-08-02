# PlayerJoinMessages
A simple spigot plugin built for 1.17.x allow you to configure join and leave messages on your server.

`config.yml` is where you can set up your custom messages. The `%player%` variable can be used to display the players name. Color codes are supported!

Default config.yml:
```
FirstTimeJoinMessage: "&7[&4!&7]&d Welcome to the server &a%player%"
JoinMessage: "&7[&a+&7]&d %player%"
LeaveMessage: "&7[&c-&7]&d %player%"
```