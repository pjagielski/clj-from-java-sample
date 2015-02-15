(ns clj-interop.counter
  (:gen-class
    :name clj.interop.SafeCounter
    :implements [clj.interop.Counter]
    :state state
    :init init
    :prefix "-"))

(defn -init []
  [[] (atom 0)])

(defn -inc [this]
  (swap! (.state this) inc))

(defn -value [this]
  @(.state this))
