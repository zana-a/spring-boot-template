# spring-boot-template

Quick template for starting a spring boot application.

## Information

### Requirements

1. JDK 21+
2. Docker

### Setup

This project requires no IDE to get started. However, I highly recommend using Intellij IDEA
Community (which is free) or Intellij Ultimate (which contains a lot of useful tools for building
spring-boot applications but is paid product).

Secondly, I strongly recommend using the style guide provided in the root of the project and turn on
autoformatting in Intellij. Follow
[Code style schemes](https://www.jetbrains.com/help/idea/configuring-code-style.html) for help on
how to add it to your project.

Finally, make sure that you have changed the version, group name, project name and anything else
that has been defaulted. When booting up the application, I recommend using the `dev` profile. If it
fails, you may need to run the `docker-compose.yml` file in order to have some database to connect
to.

> Might create a little tool to generate this project with custom information rather than hard
> coded ones. However, this suffices for the time being.
