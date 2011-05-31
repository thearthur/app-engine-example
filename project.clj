(defproject nandxorbox "1.0.0-SNAPSHOT"
  :description "Arthurs Dev Sandbox"
  :aot [nandxorbox.core nandxorbox.app_servlet]
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [compojure "0.6.2"]
                 [hiccup "0.3.4"]]
  
  :dev-dependencies [[appengine-magic "0.4.1"]
                     [swank-clojure "1.2.1"]])
