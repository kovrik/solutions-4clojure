(defn fact [n]
  (reduce * (range 1 (+ 1 n))))

(= (fact 1) 1)

(= (fact 3) 6)

(= (fact 5) 120)

(= (fact 8) 40320)
