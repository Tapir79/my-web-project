(defproject my-web-project "0.1.0-SNAPSHOT"
  :description "My first test web project with Clojure"
  :plugins [[lein-ring "0.8.7"]
            [compojure "1.1.6"]]
  ; provides a handler that points to /src/my-web-project/core.clj file and function app_routes
  :ring {:handler my-web-project.core/handler
         :auto-reload? true
         :auto-refresh? false}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring "1.2.0"]
                 [hiccup "1.0.4"]
                 [ring/ring-json "0.2.0"]
                 [compojure "1.1.6"]])