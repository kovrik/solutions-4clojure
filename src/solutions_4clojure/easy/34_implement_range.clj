;; restrictions: range

(defn rng [& args]
  (let [left  (first args)
        right  (last args)]
    (loop [res []
           l left]
      (if (< l right)
        (recur (conj res l)
               (inc l))
        res))))

(= (rng 1 4)  '(1 2 3))

(= (rng -2 2) '(-2 -1 0 1))

(= (rng 5 8)  '(5 6 7))
