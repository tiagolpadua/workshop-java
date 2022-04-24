#!/usr/bin/env bash
javac -d outDir --module-source-path modules $(find modules -name "*.java")