(ns clojure-api-labs.core
  (:require [toucan.db :as db
             toucan.models :as models])
  (:gen-class))

(def db-config
  {:dbtype "postgres"
   :dbname "clojure-api-labs"
   :user "postgres"
   :password "postgres"})

(defn -main
  [& args]
  (db/set-default-db-connection! db-config)
  (models/set-root-namespace! 'clojure-api-labs.models))
