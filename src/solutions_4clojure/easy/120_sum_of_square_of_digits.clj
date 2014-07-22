(defn sum-of-square-of-digits [coll]
  (count (filter
          (fn [n] (< n (reduce + (map #(Math/pow (Character/digit % 10) 2) (str n)))))
          coll)))

(= 8  (sum-of-square-of-digits (range 10)))

(= 19 (sum-of-square-of-digits (range 30)))

(= 50 (sum-of-square-of-digits (range 100)))

(= 50 (sum-of-square-of-digits (range 1000)))
