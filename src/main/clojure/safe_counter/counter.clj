(ns safe-counter.counter
  (:gen-class
    :name safe_counter.Counter
    :state state
    :init init
    :prefix "-"
    :methods [[inc [] void]
              [value [] int]]))

(defn -init []
  [[] (atom 0)])

(defn -inc [this]
  (swap! (.state this) inc))

(defn -value [this]
  @(.state this))
