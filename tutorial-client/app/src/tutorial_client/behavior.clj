(ns ^:shared tutorial-client.behavior
    (:require [clojure.string :as string]
              [io.pedestal.app.messages :as msg]))

(defn inc-transform [old_value _]
  ((fnil inc 0) old_value))

(def example-app
  {:version 2
   :transform [[:inc [:my-counter] inc-transform]]})

