#!/usr/bin/env bash

RELEASE_VERSION=`cat VERSION`
echo "Publishing $RELEASE_VERSION to Maven Central"
mvn versions:set --batch-mode --errors -DgenerateBackupPoms=false -DnewVersion="$RELEASE_VERSION"
mvn deploy -DperformRelease -DskipTests --errors
