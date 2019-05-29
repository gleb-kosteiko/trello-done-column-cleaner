[![Build Status](https://travis-ci.org/gleb-kosteiko/trello-done-column-cleaner.svg?branch=master)](https://travis-ci.org/gleb-kosteiko/trello-done-column-cleaner)
[![MIT licensed](https://img.shields.io/badge/license-MIT-blue.svg)](./LICENSE)

# trello-done-column-cleaner

Simple job executed by schedule to clear Done column in ToDo using Trello REST API.

It's [deployed to Heroku](https://dashboard.heroku.com/apps/trello-done-column-cleaner) and triggered by Heroku schedule plugin.

## How to build:

`mvn package`

## How to run:

`java -jar target/done-column-cleaner-0.0.1-SNAPSHOT.jar`
