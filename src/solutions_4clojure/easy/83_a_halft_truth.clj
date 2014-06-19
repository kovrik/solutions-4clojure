(defn ht [& args]
  (let [trues (apply + (map #(if % 1 0) args))
        cnt (count args)]
    (and (not= 0 trues)
         (not= cnt trues))))

(= false (ht false false))

(= true  (ht true false))

(= false (ht true))

(= true  (ht false true false))

(= false (ht true true true))

(= true  (ht true true true false))
