; 97 - Pascal's Triangle
(defn pascal-row [rownum]
  (letfn [(pascal-cell [n k]
            (if-not (zero? k)
              (* (pascal-cell n (dec k)) (/ (- (inc n) k) k))
              1))]
    (map #(pascal-cell (dec rownum) %) (range rownum))))

(= (pascal-row 1) [1])

(= (map pascal-row (range 1 6))
   [     [1]
         [1 1]
         [1 2 1]
         [1 3 3 1]
         [1 4 6 4 1]])

(= (pascal-row 11)
   [1 10 45 120 210 252 210 120 45 10 1])
