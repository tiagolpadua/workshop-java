javac --enable-preview --release 17 -d outDir --module-source-path modules^
 modules/matching4switch/module-info.java^
 modules/matching4switch/com/example/modules/matching4switch/PatternMatching4Switch.java
 
java --enable-preview --module-path outDir -m matching4switch/com.example.modules.matching4switch.PatternMatching4Switch