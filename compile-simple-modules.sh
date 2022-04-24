#!/usr/bin/env bash
javac -d outDir --module-source-path src/modules $(find src/modules -name "*.java")