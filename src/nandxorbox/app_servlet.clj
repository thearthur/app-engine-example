(ns nandxorbox.app_servlet
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use nandxorbox.core)
  (:use [appengine-magic.servlet :only [make-servlet-service-method]]))


(defn -service [this request response]
  ((make-servlet-service-method nandxorbox-app) this request response))
