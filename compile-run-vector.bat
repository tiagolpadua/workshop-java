javac -d outDir --module-source-path modules^
 modules/vector/module-info.java^
 modules/vector/com/example/modules/vector/VectorAPI.java
 
java --module-path outDir -m vector/com.example.modules.vector.VectorAPI