Polymer Hello World Demo
========================

```
./gradle compileKotlin2js
npm install -g http-server
http-server .
```

Then open <http://localhost:8080>

But failed:

```
Uncaught TypeError: Class constructor PolymerElement cannot be invoked without 'new'
    at new CustomElement (kotlin-polymer-hello-world-demo.js:14)
```