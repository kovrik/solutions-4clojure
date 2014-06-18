; restriction: interleave

(defn intrlv [left right]
  (loop [res []
         l left
         r right]
    (if (or (empty? l) (empty? r))
      res
      (recur (conj res (first l) (first r)) (rest l) (rest r)))))

(= (intrlv [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))

(= (intrlv [1 2] [3 4 5 6]) '(1 3 2 4))

(= (intrlv [1 2 3 4] [5]) [1 5])

(= (intrlv [30 20] [25 15]) [30 25 20 15])
