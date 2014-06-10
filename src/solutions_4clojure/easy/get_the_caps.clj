(defn cap[s]
  (apply str (filter #(<= 64 (int %) 91) s)))

(= (cap "HeLlO, WoRlD!") "HLOWRD")

(empty? (cap "nothing"))

(= (cap "$#A(*&987Zf") "AZ")



;; (fn [s] (apply str (filter #(<= 64 (int %) 91) s)))
