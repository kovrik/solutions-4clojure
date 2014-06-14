(defn cap [s]
  (apply str (re-seq #"[A-Z]+" s)))

(= (cap "HeLlO, WoRlD!") "HLOWRD")

(empty? (cap "nothing"))

(= (cap "$#A(*&987Zf") "AZ")
