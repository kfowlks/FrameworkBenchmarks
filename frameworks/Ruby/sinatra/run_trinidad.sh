#!/bin/bash

fw_depends rvm jruby-1.7

rvm jruby-$JRUBY_VERSION do bundle install --jobs=4 --gemfile=$TROOT/Gemfile --path=vendor/bundle

WEB_SERVER=Trinidad DB_HOST=${DBHOST} rvm jruby-$JRUBY_VERSION do bundle exec trinidad --config config/trinidad.yml &
